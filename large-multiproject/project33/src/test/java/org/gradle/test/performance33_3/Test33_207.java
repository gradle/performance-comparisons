package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_207 {
    private final Production33_207 production = new Production33_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}