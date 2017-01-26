package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_338 {
    private final Production79_338 production = new Production79_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}