package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_466 {
    private final Production33_466 production = new Production33_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}