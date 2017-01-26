package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_288 {
    private final Production33_288 production = new Production33_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}