package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_331 {
    private final Production79_331 production = new Production79_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}