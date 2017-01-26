package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_207 {
    private final Production19_207 production = new Production19_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}