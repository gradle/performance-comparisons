package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_234 {
    private final Production81_234 production = new Production81_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}