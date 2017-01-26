package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_207 {
    private final Production91_207 production = new Production91_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}