package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_246 {
    private final Production33_246 production = new Production33_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}