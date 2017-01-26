package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_353 {
    private final Production46_353 production = new Production46_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}