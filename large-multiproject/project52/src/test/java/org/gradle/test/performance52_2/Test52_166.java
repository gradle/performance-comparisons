package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_166 {
    private final Production52_166 production = new Production52_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}