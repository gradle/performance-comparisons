package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_216 {
    private final Production33_216 production = new Production33_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}