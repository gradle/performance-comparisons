package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_119 {
    private final Production64_119 production = new Production64_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}