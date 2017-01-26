package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_220 {
    private final Production64_220 production = new Production64_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}