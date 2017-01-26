package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_59 {
    private final Production64_59 production = new Production64_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}