package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_255 {
    private final Production79_255 production = new Production79_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}