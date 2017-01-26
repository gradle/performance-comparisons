package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_270 {
    private final Production33_270 production = new Production33_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}