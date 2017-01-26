package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_207 {
    private final Production29_207 production = new Production29_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}