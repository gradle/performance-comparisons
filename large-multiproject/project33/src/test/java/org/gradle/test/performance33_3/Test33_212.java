package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_212 {
    private final Production33_212 production = new Production33_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}