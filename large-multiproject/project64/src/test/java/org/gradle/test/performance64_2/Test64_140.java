package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_140 {
    private final Production64_140 production = new Production64_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}