package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_362 {
    private final Production33_362 production = new Production33_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}