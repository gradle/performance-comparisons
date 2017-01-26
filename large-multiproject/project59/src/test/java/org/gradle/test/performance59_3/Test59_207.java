package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_207 {
    private final Production59_207 production = new Production59_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}