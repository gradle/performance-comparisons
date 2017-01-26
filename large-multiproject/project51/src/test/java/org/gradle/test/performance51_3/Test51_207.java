package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_207 {
    private final Production51_207 production = new Production51_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}