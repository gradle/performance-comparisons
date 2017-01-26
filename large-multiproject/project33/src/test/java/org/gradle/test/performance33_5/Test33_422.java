package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_422 {
    private final Production33_422 production = new Production33_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}