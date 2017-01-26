package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_418 {
    private final Production33_418 production = new Production33_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}