package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_445 {
    private final Production79_445 production = new Production79_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}