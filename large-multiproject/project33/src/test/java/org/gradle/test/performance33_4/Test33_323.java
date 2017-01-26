package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_323 {
    private final Production33_323 production = new Production33_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}