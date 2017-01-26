package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_59 {
    private final Production19_59 production = new Production19_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}