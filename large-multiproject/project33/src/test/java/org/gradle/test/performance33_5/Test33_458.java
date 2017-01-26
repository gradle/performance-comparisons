package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_458 {
    private final Production33_458 production = new Production33_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}