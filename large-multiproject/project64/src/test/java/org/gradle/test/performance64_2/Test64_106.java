package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_106 {
    private final Production64_106 production = new Production64_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}