package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_234 {
    private final Production52_234 production = new Production52_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}