package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_98 {
    private final Production33_98 production = new Production33_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}