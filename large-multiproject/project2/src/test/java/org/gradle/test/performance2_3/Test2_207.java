package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_207 {
    private final Production2_207 production = new Production2_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}