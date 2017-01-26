package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_234 {
    private final Production71_234 production = new Production71_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}