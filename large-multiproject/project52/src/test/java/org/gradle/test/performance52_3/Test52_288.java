package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_288 {
    private final Production52_288 production = new Production52_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}