package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_53 {
    private final Production33_53 production = new Production33_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}