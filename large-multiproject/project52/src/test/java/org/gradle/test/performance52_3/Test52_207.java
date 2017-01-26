package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_207 {
    private final Production52_207 production = new Production52_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}