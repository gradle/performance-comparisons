package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_207 {
    private final Production11_207 production = new Production11_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}