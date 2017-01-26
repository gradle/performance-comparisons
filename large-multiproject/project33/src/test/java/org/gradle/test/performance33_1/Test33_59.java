package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_59 {
    private final Production33_59 production = new Production33_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}