package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_396 {
    private final Production33_396 production = new Production33_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}