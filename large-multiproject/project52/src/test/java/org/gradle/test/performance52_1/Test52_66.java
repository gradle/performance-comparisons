package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_66 {
    private final Production52_66 production = new Production52_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}