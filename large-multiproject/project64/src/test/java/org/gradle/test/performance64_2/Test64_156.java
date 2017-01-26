package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_156 {
    private final Production64_156 production = new Production64_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}