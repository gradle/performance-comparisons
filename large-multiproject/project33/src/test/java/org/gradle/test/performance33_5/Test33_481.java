package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_481 {
    private final Production33_481 production = new Production33_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}