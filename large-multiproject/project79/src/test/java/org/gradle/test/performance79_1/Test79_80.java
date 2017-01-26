package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_80 {
    private final Production79_80 production = new Production79_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}