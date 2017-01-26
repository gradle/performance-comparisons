package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_207 {
    private final Production79_207 production = new Production79_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}