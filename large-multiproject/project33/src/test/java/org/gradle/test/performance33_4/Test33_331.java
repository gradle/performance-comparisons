package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_331 {
    private final Production33_331 production = new Production33_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}