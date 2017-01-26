package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_337 {
    private final Production33_337 production = new Production33_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}