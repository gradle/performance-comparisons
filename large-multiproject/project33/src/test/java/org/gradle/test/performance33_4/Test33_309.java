package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_309 {
    private final Production33_309 production = new Production33_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}