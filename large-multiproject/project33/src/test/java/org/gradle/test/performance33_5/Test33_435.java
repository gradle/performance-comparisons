package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_435 {
    private final Production33_435 production = new Production33_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}