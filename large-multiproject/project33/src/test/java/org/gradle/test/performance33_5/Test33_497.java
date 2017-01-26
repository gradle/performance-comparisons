package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_497 {
    private final Production33_497 production = new Production33_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}