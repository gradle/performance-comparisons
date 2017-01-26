package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_44 {
    private final Production52_44 production = new Production52_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}