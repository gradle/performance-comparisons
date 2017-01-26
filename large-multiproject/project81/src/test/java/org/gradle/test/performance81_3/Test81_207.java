package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_207 {
    private final Production81_207 production = new Production81_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}