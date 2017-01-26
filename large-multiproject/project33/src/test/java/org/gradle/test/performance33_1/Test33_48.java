package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_48 {
    private final Production33_48 production = new Production33_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}