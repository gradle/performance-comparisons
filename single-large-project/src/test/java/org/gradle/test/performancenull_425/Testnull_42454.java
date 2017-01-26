package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42454 {
    private final Productionnull_42454 production = new Productionnull_42454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}