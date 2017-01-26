package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_207 {
    private final Production85_207 production = new Production85_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}