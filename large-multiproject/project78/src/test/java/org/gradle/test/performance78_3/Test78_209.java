package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_209 {
    private final Production78_209 production = new Production78_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}