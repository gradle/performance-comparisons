package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_207 {
    private final Production90_207 production = new Production90_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}