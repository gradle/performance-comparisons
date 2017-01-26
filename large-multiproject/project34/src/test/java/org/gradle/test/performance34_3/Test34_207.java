package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_207 {
    private final Production34_207 production = new Production34_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}