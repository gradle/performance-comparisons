package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_76 {
    private final Production79_76 production = new Production79_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}